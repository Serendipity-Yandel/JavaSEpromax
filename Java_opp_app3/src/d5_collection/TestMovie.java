package d5_collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestMovie {
    public static void main(String[] args) {

        Collection<Movie>movies=new ArrayList<>();
        //添加实例化对象到集合中
        Movie m=new Movie("《李白传》",9.3,"李白");
        movies.add(m);
        movies.add(new Movie("《三国演义》",9.7,"李四"));
        movies.add(new Movie("《水浒传》",9.9,"张三"));


        //遍历集合
        for(Movie movie:movies){
            System.out.println("片名"+movie.getName());
            System.out.println("评分"+movie.getScore());
            System.out.println("演员"+movie.getActor());
        }
    }
}
