package tk.vvtf.jobs.entity;

import java.util.Objects;

public class JobOffer {

    private String title;

    private String position;

    private String description;

    private Integer offeredPay;

    public JobOffer(String title, String position, String description, Integer offeredPay) {
        this.title = title;
        this.position = position;
        this.description = description;
        this.offeredPay = offeredPay;
    }

    public JobOffer() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOfferedPay() {
        return offeredPay;
    }

    public void setOfferedPay(Integer offeredPay) {
        this.offeredPay = offeredPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobOffer)) return false;
        JobOffer jobOffer = (JobOffer) o;
        return Objects.equals(getTitle(), jobOffer.getTitle()) &&
                Objects.equals(getPosition(), jobOffer.getPosition()) &&
                Objects.equals(getDescription(), jobOffer.getDescription()) &&
                Objects.equals(getOfferedPay(), jobOffer.getOfferedPay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPosition(), getDescription(), getOfferedPay());
    }

    @Override
    public String toString() {
        return "JobOffer{" +
                "title='" + title + '\'' +
                ", position='" + position + '\'' +
                ", description='" + description + '\'' +
                ", offeredPay=" + offeredPay +
                '}';
    }
}
