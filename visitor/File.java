package visitor;

public class File extends Entry{
    int size;
    String name;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }
    
}
