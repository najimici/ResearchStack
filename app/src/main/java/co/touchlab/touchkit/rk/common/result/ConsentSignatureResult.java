package co.touchlab.touchkit.rk.common.result;
import co.touchlab.touchkit.rk.common.model.ConsentDocument;
import co.touchlab.touchkit.rk.common.model.ConsentSignature;

public class ConsentSignatureResult extends StepResult
{

    ConsentSignature signature;

    boolean consented;

    ConsentDocument document;

    public ConsentSignatureResult(String identifier)
    {
        super(identifier);
    }

    public ConsentSignature getSignature()
    {
        return signature;
    }

    public void setSignature(ConsentSignature signature)
    {
        this.signature = new ConsentSignature(
                signature.getTitle(),
                signature.getSignatureDateFormatString(),
                signature.getIdentifier(),
                signature.getGivenName(),
                signature.getFamilyName(),
                signature.getSignatureImage(),
                signature.getSignatureDate()
                );
    }

    public boolean isConsented()
    {
        return consented;
    }

    public void setConsented(boolean consented)
    {
        this.consented = consented;
    }

    public ConsentDocument getDocument()
    {
        return document;
    }

    public void setDocument(ConsentDocument document)
    {
        this.document = document;
    }
}
