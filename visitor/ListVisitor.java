package visitor;

public class ListVisitor extends Visitor{

    private String currentDirectory = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDirectory+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        String temp;
        System.out.println(currentDirectory+"/"+directory);
        temp = currentDirectory;
        currentDirectory = currentDirectory+"/"+directory.name;
        for(Entry item: directory.items){
            item.accept(this);
        }
        currentDirectory = temp;
    }
}
