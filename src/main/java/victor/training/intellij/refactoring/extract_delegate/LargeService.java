package victor.training.intellij.refactoring.extract_delegate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import victor.training.intellij.support.colors.*;

@Service
@RequiredArgsConstructor
public class LargeService {
   private final YellowRepo yellowRepo;
   private final BlueRepo blueRepo;
   private final GreenRepo greenRepo;
   private final ColorMixer colorMixer;

   public void top1(long aId, long bId) {
      // extract me
      int greenValue = colorMixer.mixGreen(aId, bId);

      Green green = new Green(greenValue);
      greenRepo.save(green);
   }

   private int mixGreen(long aId, long bId) {
      return colorMixer.mixGreen(aId, bId);
   }

   public int top2(long betaId) {
      Blue blue = blueRepo.findById(betaId);
      return blue.getTotal();
   }
}
// - extract delegate
// - inline delegate
