/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.devin.api.resources.imdb.errors;

import com.devin.api.core.DevinApiApiException;
import okhttp3.Response;

public final class MovieDoesNotExistError extends DevinApiApiException {
    /**
     * The body of the response that triggered the exception.
     */
    private final String body;

    public MovieDoesNotExistError(String body) {
        super("MovieDoesNotExistError", 404, body);
        this.body = body;
    }

    public MovieDoesNotExistError(String body, Response rawResponse) {
        super("MovieDoesNotExistError", 404, body, rawResponse);
        this.body = body;
    }

    /**
     * @return the body
     */
    @java.lang.Override
    public String body() {
        return this.body;
    }
}
