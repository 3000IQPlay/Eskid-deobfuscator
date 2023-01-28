package uwu.narumi.deobfuscator.transformer.composed;

import uwu.narumi.deobfuscator.transformer.ComposedTransformer;
import uwu.narumi.deobfuscator.transformer.Transformer;
import uwu.narumi.deobfuscator.transformer.impl.eskid.*;

import java.util.Arrays;
import java.util.List;

public class EskidTransformer extends ComposedTransformer {
	
    @Override
    public List<Transformer> transformers() {
        return Arrays.asList(
                new EskidFlowTransformer(),
                new EskidNumTransformer(),
                new EskidStringTransformer(),
        );
    }
}
