/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.glutenproject.substrait.expression;

import io.glutenproject.substrait.type.I64TypeNode;
import io.glutenproject.substrait.type.TypeNode;

import io.substrait.proto.Expression.Literal.Builder;

public class LongLiteralNode extends LiteralNodeWithValue<Long> {
  public LongLiteralNode(Long value) {
    super(value, new I64TypeNode(true));
  }

  public LongLiteralNode(Long value, TypeNode typeNode) {
    super(value, typeNode);
  }

  @Override
  protected void updateLiteralBuilder(Builder literalBuilder, Long value) {
    literalBuilder.setI64(value);
  }
}
