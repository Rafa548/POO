package Aula11.Ex2;

public class Company implements Comparable<Company>{
    private String name;
    private Double media;

    public Company(String name, Double media) {
        this.name = name;
        this.media = media;
    }

    public String getName() {
        return name;
    }
    public Double getMedia() {
        return media;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    @Override
    public int compareTo(Company o) {
        if (this.media == o.media){
            return 0;
        }
        else if(this.media > o.media){
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
