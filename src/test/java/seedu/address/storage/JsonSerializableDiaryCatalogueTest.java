package seedu.address.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import seedu.address.commons.util.JsonUtil;
import seedu.address.model.DiaryRecords;
import seedu.address.testutil.TypicalDiaries;

public class JsonSerializableDiaryCatalogueTest {

    private static final Path TEST_DATA_FOLDER = Paths.get("src", "test", "data", "JsonSerializableDukeCooksTest");
    private static final Path TYPICAL_DIARIES_FILE = TEST_DATA_FOLDER.resolve("typicalDiariesDukeCooks.json");

    @Test
    public void toModelType_typicalDiariesFile_success() throws Exception {
        JsonSerializableDiaryCatalogue dataFromFile = JsonUtil.readJsonFile(TYPICAL_DIARIES_FILE,
                JsonSerializableDiaryCatalogue.class).get();
        DiaryRecords diaryRecordsFromFile = dataFromFile.toModelType();
        DiaryRecords typicalDiaryRecords = TypicalDiaries.getTypicalDiaryRecords();
        assertEquals(diaryRecordsFromFile, typicalDiaryRecords);
    }
}
