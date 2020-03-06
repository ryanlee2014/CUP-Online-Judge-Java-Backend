import {argumentMap, JavaInteger} from 'interpret-util';
import {TDubboCallResult, Dubbo} from 'dubbo2.js';

export interface IHelloWorldProvider {
  add(Integer0: JavaInteger, Integer1: JavaInteger): TDubboCallResult<number>;
}

export const HelloWorldProviderWrapper = {add: argumentMap};

export function HelloWorldProvider(dubbo: Dubbo): IHelloWorldProvider {
  return dubbo.proxyService<IHelloWorldProvider>({
    dubboInterface: 'com.cupacm.javabackend.dubbo.api.HelloWorldProvider',
    methods: HelloWorldProviderWrapper,
  });
}

//generate by interpret-cli dubbo2.js
