import React, { useState, useEffect } from 'react';
import { TextInput, StyleSheet, StatusBar, TouchableOpacity, Text, View } from 'react-native';
import { Button } from 'react-native-web';

export default function App() {
  const [peso, setPeso] = useState('');
  const [altura, setAltura] = useState('');
  const [camposPreenchidos, setCamposPreenchidos] = useState(false);


  useEffect(() => {
    if (peso && altura) {
      setCamposPreenchidos(true);
    } else {
      setCamposPreenchidos(false);
    }
  }, [peso, altura]);

  const onChangePeso = (peso) => {
    setPeso(peso);
  };

  const onChangeAltura = (altura) => {
    setAltura(altura.replace(/[^0-9]/g, '').replace(/(\d{1})(\d{1})/, '$1.$2'));
  };

  const calcularIMC = () => {
    if (!peso || !altura) {
      return;
    }
    const imc = parseFloat(peso) / (parseFloat(altura) * parseFloat(altura));
    let status = '';
    if (imc < 18.5) {
      status = 'Abaixo do peso';
    } else if (imc >= 18.5 && imc < 25) {
      status = 'Peso normal';
    } else if (imc >= 25 && imc < 30) {
      status = 'Acima do peso';
    } else {
      status = 'Obesidade';
    }
    alert(`Seu IMC é ${imc.toFixed(2)} (${status})`);
  };

  return (
    <View style={styles.container}>
      <TextInput
        style={styles.input}
        onChangeText={onChangePeso}
        placeholder='Peso'
        value={peso}
        keyboardType='decimal-pad'
      />
      <TextInput
        style={styles.input}
        onChangeText={onChangeAltura}
        placeholder='Altura'
        value={altura}
        keyboardType='decimal-pad'
      />
      <TouchableOpacity
        disabled={!camposPreenchidos}
        style={[
          styles.buttonCalcular,
          camposPreenchidos ? styles.buttonCalcular : styles.buttonCalcularDisabled,
        ]}
        onPress={calcularIMC}>
        <Text style={styles.textoButton}>Calcular IMC</Text>
      </TouchableOpacity>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    padding: 25
  },
  input: {
    height: 40,
    borderWidth: 1,
    borderRadius: 5,
    paddingHorizontal: 10,
    marginVertical: 10,
    borderColor: 'grey',
  },
  buttonCalcular: {
    marginTop: 10,
    borderWidth: 0,
    backgroundColor: '#72bd67',
    height: 40,
    alignItems: 'center',
    justifyContent: 'center',
    borderRadius: 5,
    color: 'red'
  },
  textoButton: {
    color: 'white',
    fontWeight: 500,
    textTransform: 'uppercase',
  },
  buttonCalcularDisabled: {
    backgroundColor: 'grey',
  }
});
