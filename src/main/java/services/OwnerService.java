package services;

import entities.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OwnerService {
    private OwnerService ownerRepository;

    public void addStore(Store store) {
        storeReppository.save(store);
    }
}
