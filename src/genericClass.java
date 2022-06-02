import javax.swing.*;


// T cannot be primitive types like int,  , they must be objects, primitives types are not objects
public class genericClass <T>
{
     // T, stands for type, it is the unknown type that will assinged by the user when creating an object of this class
   // assing the class to obj
    private T obj; // its should declared here at least once

   // set and get the object
    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }


    // pair of two unknown classes
    static class pairGenericClass<K, V>
    {
        // always assign , set and return the types
        private K key;
        private V value;

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }



    public static void main(String[] args) {
        // a string object created via a generic class
        genericClass <String> obj = new genericClass<>();
        obj.setObj("Hello");
        System.out.println(obj.getObj());

        // This object has two different value(Objects) types = Hashmap!
        pairGenericClass <Integer,String >pairValue = new pairGenericClass<>();
        pairValue.setKey(1);
        pairValue.setValue("Hassan");
        System.out.println(pairValue.getValue());

    }
}
