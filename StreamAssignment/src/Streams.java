
    import java.lang.*;
import java.util.*;
    class News
    {
        int newsId;
        String postedByUser;
        String commentByUser;
        String comment;
        News(int newsId,String postedByUser,String commentByUser,String comment)
        {
            this.newsId=newsId;
            this.postedByUser=postedByUser;
            this.commentByUser=commentByUser;
            this.comment=comment;

        }

        @Override
        public String toString() {
            return  "News{" +
                    "newId=" + newsId +
                    ", postedByUser='" + postedByUser + '/' +
                    ", commentByUser='" + commentByUser + '/' +
                    ", comment='" + comment + '/' +
                    '}';

        }
    }
    public class Streams {
        public static void main(String args[])
        {
            List<String> news= Arrays.asList();{
            new News(1001,"foUser post","User-comment","comment");
            new News(1002,"youtubeUser post","youtubeUser-comment","comment");
            new News(1002,"youtubeUser post","youtubeUser-comment","comment");
            new News(1004,"youtubeUser post","youtubeUser-comment","comment");

        };

        }
    }

