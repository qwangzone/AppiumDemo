public class Static_Lianxi {
    public static void start(){
            System.out.println("start.......");
        }

        public static void end(){
            System.out.println("end......");
        }
        public void add(){
            System.out.println("add fangfa ");
        }
        public static Static_Lianxi sta;
        public static void main(String[] args){
        sta = new Static_Lianxi();
        sta.end();
        start();
        end();
        Static_Lianxi j = new Static_Lianxi();
        j.add();
        j.end();
        j.start();
    }

}

