package message;

import cards.Card;
import character.Hero;

import java.util.ArrayList;

public class HeroBean {
    private String name;

    private String sex;

    private int bloods;

    private ArrayList<SkillBean> skillBeans = new ArrayList<>();

    private ArrayList<CardBean> cardBeans = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBloods() {
        return bloods;
    }

    public void setBloods(int bloods) {
        this.bloods = bloods;
    }

    public ArrayList<SkillBean> getSkillBeans() {
        return skillBeans;
    }

    public void setSkillBeans(ArrayList<SkillBean> skillBeans) {
        this.skillBeans = skillBeans;
    }

    public ArrayList<CardBean> getCardBeans() {
        return cardBeans;
    }

    public void setCardBeans(ArrayList<CardBean> cardBeans) {
        this.cardBeans = cardBeans;
    }

    public static HeroBean getHeroBean(Hero hero) {
        HeroBean heroBean = new HeroBean();
        heroBean.setName(hero.getName());
        heroBean.setSex(hero.getSex());
        heroBean.setBloods(hero.getBloods());
        hero.getCards().forEach(card -> {
            CardBean cardBean = new CardBean();
            SkillBean skillBean = new SkillBean();
            cardBean.setColor(card.getColor());
            cardBean.setNumber(card.number);

            skillBean.setAnswerIdList(card.getSkill().getAnswerIdList());
            skillBean.setEffect(card.getSkill().effect);
            skillBean.setId(card.getSkill().id);
            skillBean.setName(card.getSkill().name);
            cardBean.setSkillBean(skillBean);
            heroBean.cardBeans.add(cardBean);
        });

        return  heroBean;
    }
}
