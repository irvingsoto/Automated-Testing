public enum TestData {

    TEST_01("https://the-internet.herokuapp.com/","Hellow");

    private final String url;
    private final String input;

    TestData(String url, String input) {
        this.url = url;
        this.input = input;
    }

    public String getUrl() {
        return url;
    }

    public String getInput() {
        return input;
    }

}
