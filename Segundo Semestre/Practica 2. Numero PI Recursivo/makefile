P = Main
MAIN_CLASS = aplicacion.Principal
SRC_DIR = ./src
OUT_DIR = bin
LIB_DIR = ./lib
DOC_DIR = html
JAR_FILE = $(P).jar
MANIFEST = manifest.txt

# Compilar código fuente
compilar: limpiar
	mkdir -p $(OUT_DIR)
	javac -cp $(OUT_DIR):$(LIB_DIR) -d $(OUT_DIR) $(shell find $(SRC_DIR) -name "*.java")

# Generar el JAR con manifest
jar: compilar manifest
	jar cvfm $(JAR_FILE) $(MANIFEST) -C $(OUT_DIR) .

# Ejecutar sin JAR
ejecutar: compilar
	java -cp $(OUT_DIR) $(MAIN_CLASS) 5000

# Generar manifest antes de empaquetar
manifest:
	@echo "Manifest-Version: 1.0" > $(MANIFEST)
	@echo "Main-Class: $(MAIN_CLASS)" >> $(MANIFEST)
	@echo "Class-Path: ." >> $(MANIFEST)

# Limpiar archivos generados
limpiar:
	rm -rf $(OUT_DIR)
	rm -rf $(DOC_DIR)
	rm -f $(JAR_FILE) $(MANIFEST)

# Generar documentación con Javadoc
javadoc: compilar
	javadoc -d $(DOC_DIR) -encoding utf-8 -docencoding utf-8 -charset utf-8 $(shell find $(SRC_DIR) -name "*.java")

# Debug con JDB
debug: compilar
	javac -g -cp $(OUT_DIR):$(LIB_DIR) -d $(OUT_DIR) $(shell find $(SRC_DIR) -name "*.java")
	cd $(OUT_DIR); jdb -sourcepath ../$(SRC_DIR)
# Ejecutar el JAR generado
runjar: jar
	java -jar $(JAR_FILE) 5000
