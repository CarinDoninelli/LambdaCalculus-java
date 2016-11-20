/*
 * Copyright 2016 noti0na1 (i@notnl.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.notnl.lambda;

/**
 * Created by noti0 on 2016/11/18.
 */
public class Lambda {

    /**
     * @param name
     * @return
     */
    public static Variable var(String name) {
        return new Variable(name);
    }

    /**
     * @param name
     * @param body
     * @return
     */
    public static Function lambda(String name, String body) {
        return new Function(new Variable(name), new Variable(body));
    }

    /**
     * @param name
     * @param body
     * @return
     */
    public static Function lambda(String name, Expression body) {
        return new Function(new Variable(name), body);
    }

    /**
     * @param name
     * @param body
     * @return
     */
    public static Function lambda(Variable name, Expression body) {
        return new Function(name, body);
    }

    /**
     * @param name
     * @param body
     * @return
     */
    public static Function λ(String name, String body) {
        return new Function(new Variable(name), new Variable(body));
    }

    /**
     * @param name
     * @param body
     * @return
     */
    public static Function λ(String name, Expression body) {
        return new Function(new Variable(name), body);
    }

    /**
     * @param name
     * @param body
     * @return
     */
    public static Function λ(Variable name, Expression body) {
        return new Function(name, body);
    }

    /**
     * @param function
     * @param arguement
     * @return
     */
    public static Application apply(String function, String arguement) {
        return new Application(new Variable(function), new Variable(arguement));
    }

    /**
     * @param function
     * @param arguement
     * @return
     */
    public static Application apply(String function, Expression arguement) {
        return new Application(new Variable(function), arguement);
    }

    /**
     * @param function
     * @param arguement
     * @return
     */
    public static Application apply(Expression function, String arguement) {
        return new Application(function, new Variable(arguement));
    }

    /**
     * @param function
     * @param arguement
     * @return
     */
    public static Application apply(Expression function, Expression arguement) {
        return new Application(function, arguement);
    }
}
