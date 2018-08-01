package interfacedemo;

    public interface Sports {
        final long age=1021;
        public void sports1();
        public void sports2();
        default void sport3(){
            System.out.println("我是jdk1.8默认实现方法...");
        }
        static void staticmethod(){
            System.out.println("我是静态方法");
        }
}
