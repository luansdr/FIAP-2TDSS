import React, { useState } from 'react';
import { Text, View, StyleSheet, Modal, Pressable, StatusBar, FlatList } from 'react-native';
import json from './comidas.json';

export default function App() {

  const [modalVisible, setModalVisible] = useState(false);
  const [jsonList, setJsonList] = useState(json);

  const editarLista = (param, index) => {
    if (param === 'excluir') {
      setJsonList(jsonList.slice(0, index).concat(jsonList.slice(index + 1)));
    }
  };
  return (
    <View style={styles.container}>
      <StatusBar backgroundColor="#355436" barStyle="light-content" />

      <Modal
        animationType='slide'
        transparent={true}
        visible={modalVisible}
        onRequestClose={() => setModalVisible(false)}
      >
        <View style={styles.modal}>
          <View style={styles.headerModal}>
            <View></View>
            <Text style={styles.modalHeaderText}>MODAL</Text>
            <Pressable onPress={() => setModalVisible(false)} style={styles.botaoFechar}>
              <Text style={styles.textBotao}>X</Text>
            </Pressable>
          </View>

          <View style={styles.containerFlatList}>
            <FlatList
              style={styles.flatList}
              data={jsonList}
              renderItem={({ item, index }) => (
                <View style={styles.alignItems}>
                  <Text style={styles.lineList}>
                    {item.id} -
                    <Text style={styles.textDestaque}>{item.nome}</Text>
                  </Text>
                  <Pressable style={styles.excluir} onPress={() => editarLista('excluir', index)}>
                    <Text>Excluir</Text>
                  </Pressable>
                </View>
              )}
              keyExtractor={item => item.id.toString()}
            />
          </View>
        </View>
      </Modal>

      <Text>Abrir MODAL</Text>
      <Pressable onPress={() => setModalVisible(true)} style={styles.botao}>
        <Text style={styles.textBotao}>Abrir</Text>
      </Pressable>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#ffff',
    alignItems: 'center',
    marginTop: StatusBar.currentHeight,
  },
  botao: {
    backgroundColor: "#355436",
    paddingHorizontal: 25,
    paddingVertical: 4,
    borderRadius: 15,
  },
  botaoFechar: {
    backgroundColor: "#f44",
    padding: 10,
    paddingHorizontal: 15,
    borderRadius: 100,
  },
  textBotao: {
    fontSize: 15,
    color: '#ffff',
  },
  alignItems: {
    flexDirection: 'row',
    width: '100%',
    justifyContent: 'space-between',
    alignItems: 'center',

    backgroundColor: 'lightblue',
    borderWidth: 1,
    padding: 16,
},
  modal: {
  flex: 1,
  backgroundColor: '#ffff',
  marginTop: StatusBar.currentHeight,
  width: '100%',
},
excluir: {
  padding: 10,
  backgroundColor: '#f44',
  borderRadius: 25
},
  containerFlatList: {
  flex: 1,
  backgroundColor: '#ffff',
  alignItems: 'center',
  marginBottom: 20,
},
  flatList: {
  width: '88%',
  shadowColor: 'black',
  shadowOffset: {
    width: 0,
    height: 2,
  },
  shadowOpacity: 0.25,
  shadowRadius: 3.84,
  elevation: 5,
},
  textDestaque: {
  fontWeight: 'bold',
},
  headerModal: {
  flexDirection: 'row',
  justifyContent: 'space-between',
  alignItems: 'center',
  padding: 10,
  width: '100%',
},
  modalHeaderText: {
  fontSize: 20,
  fontWeight: 'bold',
}
 
});
