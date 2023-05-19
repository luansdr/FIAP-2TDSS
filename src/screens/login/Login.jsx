import {
    StyleSheet, Text,
    View
} from "react-native";

export default function Login() {
  return (
    <View style={styles.container}>
        <Text>Teste</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#dfdfdf",
  },
  input: {
    height: 40,
    borderWidth: 1,
    borderRadius: 5,
    paddingHorizontal: 10,
    marginVertical: 10,
    borderColor: "grey",
  },
  buttonCalcular: {
    marginTop: 10,
    borderWidth: 0,
    backgroundColor: "#72bd67",
    height: 40,
    alignItems: "center",
    justifyContent: "center",
    borderRadius: 5,
    color: "red",
  },
  textoButton: {
    color: "white",
    fontWeight: 500,
    textTransform: "uppercase",
  },
  buttonCalcularDisabled: {
    backgroundColor: "grey",
  },
});
