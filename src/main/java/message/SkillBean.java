package message;

public class SkillBean {
    private String name;

    private int id = 0;

    private int effect = 0;

    private int[] answerIdList = {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEffect() {
        return effect;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }

    public int[] getAnswerIdList() {
        return answerIdList;
    }

    public void setAnswerIdList(int[] answerIdList) {
        this.answerIdList = answerIdList;
    }
}
