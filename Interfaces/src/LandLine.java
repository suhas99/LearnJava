public class LandLine implements ITelephone {
    private String myPhoneNumber;
    private boolean isRinging;

    public LandLine(String myPhoneNumber, boolean isRinging) {
        this.myPhoneNumber = myPhoneNumber;
        this.isRinging = isRinging;
    }

    public String getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public void setMyPhoneNumber(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    @Override
    public void dialNumber(String phoneNumber) {
        System.out.println("Now dialing "+phoneNumber+" on landline");

    }

    @Override
    public void answerNumber() {
        if(isRinging){
            System.out.println("Answering landline");
            isRinging=false;
        }

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
