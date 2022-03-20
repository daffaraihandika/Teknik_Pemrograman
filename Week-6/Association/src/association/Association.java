package association;
import java.util.ArrayList;
import java.util.List;

public class Association {

    public static void main(String[] args) throws Exception {
            Singer singer = new Singer();
            singer.setSingerName("Hindia");

            Song song1 = new Song();
            song1.setSongName("Evaluasi");
            Song song2 = new Song();
            song2.setSongName("Rumah ke rumah");

            List<Song> empList = new ArrayList<Song>();
            empList.add(song1);
            empList.add(song2);

            singer.setSinger(empList);

            System.out.println(singer.getSongs()+" adalah lagu yang dinyanyikan oleh "+singer.getSingerName());
 
    }
    
}
