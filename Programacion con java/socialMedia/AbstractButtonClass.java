abstract class AbstractButtonClass {
    String caption;

    abstract void onButtonHover();
    
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption(){
        return this.caption;
    }
}