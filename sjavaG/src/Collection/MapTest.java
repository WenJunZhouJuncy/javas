package Collection;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
//          key类型  value类型
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "hello");
        map.put(2, "world");
        map.put(3, "students");
        map.put(4, "my love");
        map.put(5, "baby");

        String mapget = map.get(1);

        int mapsize = map.size();

        boolean mapckey = map.containsKey(1);
        boolean mapvalue = map.containsValue("world");
        boolean mapempty = map.isEmpty();

        map.remove(2);

        Collection<String> mapcs = map.values();
        for(String mapcs1 : mapcs) {
            System.out.println(mapcs1);
        }

        Set<Integer> mapkeyset = map.keySet();

        for (Integer i: mapkeyset) {
            System.out.print(i + ":");
            System.out.println(map.get(i));
        }
        System.out.println("===========");
        Set<Map.Entry<Integer, String>> mapentryset = map.entrySet();

        for (Map.Entry<Integer, String> mapen : mapentryset) {
            System.out.println(mapen + "   " + String.valueOf(mapen).split("=")[1]);

            Integer mapeni = mapen.getKey();
            String mapens = mapen.getValue();
        }

        Iterator<Map.Entry<Integer, String>> mapentryit = mapentryset.iterator();
        while (mapentryit.hasNext()) {
            Map.Entry<Integer, String> itnext = mapentryit.next();
            Integer mapit = itnext.getKey();
            String mapst = itnext.getValue();
        }
    }
}
