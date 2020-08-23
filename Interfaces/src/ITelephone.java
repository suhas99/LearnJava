// when we want to create generic method for ll classes we do this way
//All methods should be implemented by class in interface with same return types and parameter types and its number
//usally starts with "I"
public interface ITelephone {
    // not declared acees specifier because its not of use for public or private
    void dialNumber(String phoneNumber);
    void answerNumber();
    boolean isRinging();
}
