/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2024 The Enola <https://enola.dev> Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.enola.thing;

/**
 * Link is an IRI "reference" to another {@link Thing}.
 *
 * <p>IRI are normally just String in Enola; this type only exists, and is required, so that it can
 * be returned by {@link Thing#get(String)} and distinguished from a String which is not an IRI but
 * text.
 */
// TODO Abandon this and just use java.net.URI in Things instead?!
//   Or change this record to a class and have an URI field, for 1 time conversion.
public final record Link(String iri) {}
