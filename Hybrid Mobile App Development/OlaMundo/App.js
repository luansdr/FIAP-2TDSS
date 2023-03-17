import React from 'react';
import { Text, View } from 'react-native';
import { StatusBar } from 'expo-status-bar';

const App = () => (
  <>
  <StatusBar backgroundColor="white" style="dark" />
  
  <View
    style={{
      flex: 1,
      backgroundColor: '#000',
      alignItems: 'center',
      justifyContent: 'center',
    }}>
    <Text style={{ color: '#fff' }}>Notice that the status bar has light text!</Text>
    
  </View>
  </>
 
);

export default App;