public class lesson_08 {
    /**
     * В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
     */
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> {
        public StringObject getInstance() {
            System.out.println("xo");
            return null;
        }
    }
}
