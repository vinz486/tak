package pololu.util;

import static pololu.util.sguava.Sguava.checkNotNull;

public abstract class Delegator<D>
{

    private final D delegate;

    public Delegator(D delegate)
    {
        checkNotNull(delegate, "Delegate cannot be null.");

        this.delegate = delegate;
    }

    protected D delegate()
    {
        return delegate;
    }
}
