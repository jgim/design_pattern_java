package visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
    ArrayList<Entry> items;
    String name;
    int size;

    public Directory(String name){
        items = new ArrayList<Entry>();
        this.name = name;
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
        int total = 0;
        Iterator<Entry> it = this.iterator();
        while (it.hasNext())
            total += it.next().getSize(); 
        return total;
    }

    public Iterator<Entry> iterator() {
        return items.iterator();
    }

    public Entry add(Entry entry){
        items.add(entry);
        return entry;
    }
}
