public class lesson_05 {
    /**
     * Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable.
     * Не забудь реализовать методы!
     */
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable {
        @Override
        public void refresh() {

        }

        @Override
        public void onSelect() {

        }
    }
}
