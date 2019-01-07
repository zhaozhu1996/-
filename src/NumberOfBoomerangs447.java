import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfBoomerangs447 {
    public static int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if(i!=j){
                    int dis = (points[i][0]-points[j][0])*(points[i][0]-points[j][0])+
                            (points[i][1]-points[j][1])*(points[i][1]-points[j][1]);
                    if(map.containsKey(dis)){
                        Integer integer = map.get(dis);
                        map.put(dis,integer+1);
                    }else {
                        map.put(dis,1);
                    }
                }

            }

            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                Integer value = entry.getValue();
                if(value >=2){
                    res+=value*(value-1);
                }
            }

        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(numberOfBoomerangs(new int[][]{{0,0},{1,0},{2,0}}));
    }
}
