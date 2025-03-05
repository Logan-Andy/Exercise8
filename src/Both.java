class Both {
    private ContactInfo ci;
    private BusinessInfo bi;

    public Both(ContactInfo ci, BusinessInfo bi) {
        this.ci = ci;
        this.bi = bi;
    }

    public ContactInfo getCi() {
        return ci;
    }

    public void setCi(ContactInfo ci) {
        this.ci = ci;
    }

    public BusinessInfo getBi() {
        return bi;
    }

    public void setBi(BusinessInfo bi) {
        this.bi = bi;
    }

    @Override
    public String toString() {
        return "Both{" +
                "ci=" + ci +
                ", bi=" + bi +
                '}';
    }
}