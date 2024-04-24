package Exam

class Job {
    String profile
    String desc
    double exp
    List<String> techs

    String getProfile() {
        return profile
    }

    void setProfile(String profile) {
        this.profile = profile
    }

    String getDesc() {
        return desc
    }

    void setDesc(String desc) {
        this.desc = desc
    }

    double getExp() {
        return exp
    }

    void setExp(double exp) {
        this.exp = exp
    }

    List<String> getTechs() {
        return techs
    }

    void setTechs(List<String> techs) {
        this.techs = techs
    }

    @Override
    public String toString() {
        return "Job{" +
                ", profile='" + profile + '\'' +
                ", desc='" + desc + '\'' +
                ", exp=" + exp +
                ", techs=" + techs +
                '}';
    }
}
