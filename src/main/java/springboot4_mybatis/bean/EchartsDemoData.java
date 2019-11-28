package springboot4_mybatis.bean;

public class EchartsDemoData {
    private String categories;
    private String data;

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "EchartsDeomData{" +
                "categories='" + categories + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
