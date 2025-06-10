public class stringsShortestPath {
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
    public static float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir =path.charAt(i);
            
            // north
            if(dir == 'N'){
                y++;
            }
            // south
            else if(dir == 'S'){
                y--;
            }
            // east
            else if(dir =='E'){
                x++;
            }
            // west
            else{
                x--;
            }
        }
        int X2= x*x;
        int Y2= y*y; 
        return (float)Math.sqrt(X2+Y2); // type cate to float
    }
}
