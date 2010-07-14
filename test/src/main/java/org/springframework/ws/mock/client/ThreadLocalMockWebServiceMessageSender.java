/*
 * Copyright 2005-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ws.mock.client;

import java.io.IOException;
import java.net.URI;

import org.springframework.ws.transport.WebServiceConnection;
import org.springframework.ws.transport.WebServiceMessageSender;

/**
 * Thread-local implementation of {@link WebServiceMessageSender}, that uses {@link MockWebServiceMessageSender}.
 *
 * @author Lukas Krecan
 * @author Arjen Poutsma
 * @since 2.0
 */
class ThreadLocalMockWebServiceMessageSender implements WebServiceMessageSender {

    public WebServiceConnection createConnection(URI uri) throws IOException {
        return MockWebServiceMessageSenderHolder.get().createConnection(uri);
    }

    public boolean supports(URI uri) {
        return MockWebServiceMessageSenderHolder.get().supports(uri);
    }
}
