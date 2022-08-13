package victor.training.intellij.refactoring.extract_delegate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import victor.training.intellij.support.colors.Blue;
import victor.training.intellij.support.colors.BlueRepo;
import victor.training.intellij.support.colors.Yellow;
import victor.training.intellij.support.colors.YellowRepo;
@Service
@RequiredArgsConstructor
public class ColorMixer {
    private final YellowRepo yellowRepo;
    private final BlueRepo blueRepo;
    private final LargeService largeService;

    int mixGreen(long aId, long bId) {
        Yellow yellow = yellowRepo.findById(aId);
        Blue blue = blueRepo.findById(bId);
        int greenValue = yellow.getTotal() + blue.getTotal();
        return greenValue;
    }
}