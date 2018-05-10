package emu.softcard;

import java.util.Collection;
import java.util.HashMap;

public class FolderObject extends SoftcardObject<Collection<SoftcardObject>> {
    private HashMap<String, SoftcardObject> content = new HashMap<>();

    protected FolderObject(String name) {
        super(name);
    }

    public FolderObject cd(String subfolder) throws SoftcardException {
        if (!content.containsKey(subfolder)) {
            throw new SoftcardException(String.format("Folder does not exist: %s", subfolder));
        }
        SoftcardObject object = content.get(subfolder);
        if (!FolderObject.class.isAssignableFrom(object.getClass())) {
            throw new SoftcardException(String.format("Not a Folder: %s", subfolder));
        }
        return FolderObject.class.cast(object);
    }

    public Collection<SoftcardObject> ls() {
        return content.values();
    }

    protected FolderObject mkdir(String subfolder) {
        FolderObject object = new FolderObject(subfolder);
        content.put(subfolder, object);
        return object;
    }

    protected SoftcardObject add(SoftcardObject object) {
        content.put(object.getName(), object);
        return object;
    }

    public <T extends SoftcardObject> T get(Class<T> type, String name) {
        Object result = this.content.get(name);
        return type.cast(result);
    }

    @Override
    public Collection<SoftcardObject> getValue() {
        return ls();
    }
}
