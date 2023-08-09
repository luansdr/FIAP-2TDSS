import { StatusBar } from 'expo-status-bar';
import React, { useState } from 'react';

import { Button, StyleSheet, Text, TextInput, View } from 'react-native';

export default function App() {

  const [nome, setNome] = useState("");

  return (
    <View style={styles.container}>
      <Text>Entre com seu nome</Text>
      <TextInput  onChangeText={setNome} autoFocus={true} style={styles.textInputEmail} placeholder='Informe seu nome' />
      <Button color="black"  onPress={_ => { nome ? alert(`Ola ${nome}`) : alert("informe seu nome")}} title={(1 == 1) ? "Entra aqui" : "Sair"} />
      <StatusBar style="auto" />
      <Text>{nome}</Text>
    </View>
  );

}


const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },

  textInputEmail: {

    width: '70%',
    borderColor: 'black',
    borderWidth: 1,
    height: 40,
    paddingHorizontal: 16,
    margin: 10
  },
  button: {
    backgroundColor: '#00aeef',
    borderColor: 'red',
    borderWidth: 5,
    borderRadius: 15       
 }


});
