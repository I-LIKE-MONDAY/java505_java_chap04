package chap04_excercise;

public class Song {
    String title;

    public Song(String songName) { // public 뒤에 String 붙이고 Song 하면 오류, String 지우면 실행됨 (WHy?)
        this.title = songName;
    }

    public String getTitle() {
        return this.title;
    }

}
