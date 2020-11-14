package rope;

public class accessmodifiers2 {
        public void methoda(){
            return;
        }
        public void methodB(){
//        return null; this will not work
        }
        public void methodD(){
            // this will work
        }
        public int methodE(){
//        return 9.0; this will not work because its not int its double
            return 0;
        }
        public int methodF(){
            //return; this will not work as well
            // have to return some integer
            return 0;
        }
        public int methodG(){
            //return null;
            // int value will not work with null as well
            return 0;
        }


    }
