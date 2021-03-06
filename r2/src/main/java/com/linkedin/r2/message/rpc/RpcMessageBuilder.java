/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

/* $Id$ */
package com.linkedin.r2.message.rpc;

import com.linkedin.r2.message.MessageBuilder;

/**
 * @author Chris Pettitt
 * @version $Revision$
 */
public interface RpcMessageBuilder<B extends RpcMessageBuilder<B>> extends MessageBuilder<B>
{
  /**
   * Constructs an immutable {@link RpcMessage} using the settings configured in this builder.
   * Subsequent changes to this builder will not change this response. The concrete
   * type of this builder (for example {@link com.linkedin.r2.message.rpc.RpcResponseBuilder}) will
   * be used to build the appropriate concrete type.
   *
   * @return an RpcMessage from the settings in this builder
   */
  @Override
  RpcMessage build();

  /**
   * Similar to {@link #build}, but the returned Message is in canonical form.
   *
   * @return an RpcMessage from the settings in this builder.
   */
  @Override
  RpcMessage buildCanonical();
}
