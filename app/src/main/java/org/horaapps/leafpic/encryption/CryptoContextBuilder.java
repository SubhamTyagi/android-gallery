package org.horaapps.leafpic.encryption;

/**
 * Used to build an {@link org.horaapps.leafpic.encryption.CryptoContext}.
 */
public class CryptoContextBuilder {

    private CryptoContext.Algorithm algorithm = CryptoContext.Algorithm.AES;
    private CryptoContext.Mode mode = CryptoContext.Mode.CTR;
    private CryptoContext.Padding padding = CryptoContext.Padding.NO_PADDING;
    private CryptoContext.KeyLength keyLength = CryptoContext.KeyLength.BITS_256;
    private CryptoContext.Pbkdf pbkdf = CryptoContext.Pbkdf.PBKDF_2_WITH_HMAC_SHA_512;
    private CryptoContext.MacAlgorithm macAlgorithm = CryptoContext.MacAlgorithm.HMAC_SHA_512;
    private int ivLength = 16;
    private CryptoContext.GcmTagLength gcmTagLength = CryptoContext.GcmTagLength.BITS_128;
    private int iterations = 10000;

    /**
     * Sets the cipher algorithm. Defaults to {@code AES} and is the only supported algorithm
     *
     * @param algorithm the {@link org.horaapps.leafpic.encryption.CryptoContext.Algorithm}
     * @return {@link org.horaapps.leafpic.encryption.CryptoContextBuilder}
     */
    public CryptoContextBuilder setAlgorithm(CryptoContext.Algorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Sets the cipher algorithm mode. Defaults to {@code CTR}
     *
     * @param mode the {@link org.horaapps.leafpic.encryption.CryptoContext.Mode}
     * @return {@link org.horaapps.leafpic.encryption.CryptoContextBuilder}
     */
    public CryptoContextBuilder setMode(CryptoContext.Mode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Sets the cipher algorithm padding. Defaults to {@code NoPadding}
     *
     * @param padding the {@link org.horaapps.leafpic.encryption.CryptoContext.Padding}
     * @return {@link org.horaapps.leafpic.encryption.CryptoContextBuilder}
     */
    public CryptoContextBuilder setPadding(CryptoContext.Padding padding) {
        this.padding = padding;
        return this;
    }

    /**
     * Sets the cipher key length. Defaults to {@code 256}
     *
     * @param keyLength the {@link org.horaapps.leafpic.encryption.CryptoContext.KeyLength}
     * @return {@link org.horaapps.leafpic.encryption.CryptoContextBuilder}
     */
    public CryptoContextBuilder setKeyLength(CryptoContext.KeyLength keyLength) {
        this.keyLength = keyLength;
        return this;
    }

    /**
     * Sets the Pbkdf algorithm. Defaults to {@code PBKDF2WithHmacSHA512}
     *
     * @param pbkdf the {@link org.horaapps.leafpic.encryption.CryptoContext.Pbkdf}
     * @return {@link org.horaapps.leafpic.encryption.CryptoContextBuilder}
     */
    public CryptoContextBuilder setPbkdf(CryptoContext.Pbkdf pbkdf) {
        this.pbkdf = pbkdf;
        return this;
    }

    /**
     * Sets the MAC algorithm. Defaults to {@code HmacSHA512}
     *
     * @param macAlgorithm the {@link org.horaapps.leafpic.encryption.CryptoContext.MacAlgorithm}
     * @return {@link org.horaapps.leafpic.encryption.CryptoContextBuilder}
     */
    public CryptoContextBuilder setMacAlgorithm(CryptoContext.MacAlgorithm macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
        return this;
    }

    /**
     * Sets the initialization vector. Defaults to {@code 16}
     * See {@link javax.crypto.spec.IvParameterSpec} or {@link javax.crypto.spec.GCMParameterSpec}
     *
     * @param ivLength the length of the initialization vector
     * @return {@link org.horaapps.leafpic.encryption.CryptoContextBuilder}
     */
    public CryptoContextBuilder setIvLength(int ivLength) {
        this.ivLength = ivLength;
        return this;
    }

    /**
     * Sets the GCM tag length. Defaults to {@code 128}
     *
     * @param gcmTagLength the tag length used for GCM modes of operation
     * @return {@link org.horaapps.leafpic.encryption.CryptoContextBuilder}
     */
    public CryptoContextBuilder setGcmTagLength(CryptoContext.GcmTagLength gcmTagLength) {
        this.gcmTagLength = gcmTagLength;
        return this;
    }

    /**
     * Sets the iterations for the Pbkdf algorithm. Defaults to {@code 10000}
     *
     * @param iterations the iterations used with the Pbkdf algorithm
     * @return {@link org.horaapps.leafpic.encryption.CryptoContextBuilder}
     */
    public CryptoContextBuilder setIterations(int iterations) {
        this.iterations = iterations;
        return this;
    }

    /**
     * 
     * Creates an {@link org.horaapps.leafpic.encryption.CryptoContext} with the arguments supplied to this builder.
     *
     * @return {@link org.horaapps.leafpic.encryption.CryptoContext}
     */
    public CryptoContext build() {
        return new CryptoContext(algorithm, mode, padding, keyLength, pbkdf, macAlgorithm, ivLength, gcmTagLength, iterations);
    }
}