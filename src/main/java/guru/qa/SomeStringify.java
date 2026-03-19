package guru.qa;

public class SomeStringify {
private String s;

    public SomeStringify(String test) {
        this.s = test;
    }

    @Override
    public boolean equals(Object o) {
           if (this == o) return true;
           if (o instanceof SomeStringify) {
               return s.equals(((SomeStringify) o).s);
           }
           if (o instanceof String) {
               return s.equals(o);
           }
           return false;
       }

    @Override
    public int hashCode() {
        return s.hashCode();  // ← Ключевой момент!
    }

}