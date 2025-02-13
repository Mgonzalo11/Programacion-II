MAIN_CLASS=aplicacion.Principal
SRC_DIR=./src
OUT_DIR=./bin
LIB_DIR=./lib
DOC_DIR=./html
JAR_FILE=MetodosIterativos.jar

# Compilar el código fuente
compilar: limpiar
	mkdir -p $(OUT_DIR)
	find $(SRC_DIR) -name "*.java" -print0 | xargs -0 javac -encoding UTF-8 -cp "$(OUT_DIR):$(LIB_DIR)/*" -d $(OUT_DIR)
	find $(OUT_DIR) -name "*.class"

# Crear el JAR ejecutable
jar: compilar
	@echo "Manifest-Version: 1.0" > manifest.txt
	@echo "Main-Class: $(MAIN_CLASS)" >> manifest.txt
	@echo "Class-Path: .:$(LIB_DIR)/*" >> manifest.txt
	jar cvfm $(JAR_FILE) manifest.txt -C $(OUT_DIR) .
	rm manifest.txt

# Ejecutar el programa compilado
ejecutar: compilar
java -cp "$(OUT_DIR):$(LIB_DIR)/*" $(MAIN_CLASS)

# Eliminar archivos generados
limpiar:
	rm -rf $(OUT_DIR)
	rm -rf $(DOC_DIR)
	rm -f $(JAR_FILE) manifest.txt

# Generar documentación Javadoc
javadoc: compilar
	mkdir -p $(DOC_DIR)
	find $(SRC_DIR) -name "*.java" -print0 | xargs -0 javadoc -d $(DOC_DIR) -encoding UTF-8 -docencoding UTF-8 -charset UTF-8

# Depuración con jdb
debug: compilar
	cd $(OUT_DIR); jdb -sourcepath ../$(SRC_DIR) $(MAIN_CLASS)

# Ejecutar el JAR
runjar: jar
	java -jar $(JAR_FILE)

