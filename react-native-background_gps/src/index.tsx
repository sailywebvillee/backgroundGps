import { NativeModules } from 'react-native';

type BackgroundGpsType = {
  multiply(a: number, b: number): Promise<number>;
};

const { BackgroundGps } = NativeModules;

export default BackgroundGps as BackgroundGpsType;
