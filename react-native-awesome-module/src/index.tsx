import { NativeModules } from 'react-native';

type AwesomeModuleType = {
  multiply(a: number, b: number): Promise<number>;
};

const { AwesomeModule } = NativeModules;

export default AwesomeModule as AwesomeModuleType;
