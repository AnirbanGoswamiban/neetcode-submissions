class TimeMap {
    constructor() {
        this.store = new Map(); // A map to hold all keys and their associated values with timestamps
    }

    /**
     * Stores the key, value, and timestamp.
     * @param {string} key
     * @param {string} value
     * @param {number} timestamp
     * @return {void}
     */
    set(key, value, timestamp) {
        if (!this.store.has(key)) {
            this.store.set(key, []); // Initialize an empty array for the key if it doesn't exist
        }
        this.store.get(key).push({ value, timestamp }); // Store the value along with the timestamp
    }

    /**
     * Retrieves the value at a specific timestamp or the nearest previous timestamp.
     * @param {string} key
     * @param {number} timestamp
     * @return {string}
     */
    get(key, timestamp) {
        if (!this.store.has(key)) {
            return ""; // Return an empty string if the key does not exist
        }

        const values = this.store.get(key);
        let left = 0, right = values.length - 1;
        let result = "";

        // Binary search to find the largest timestamp <= the given timestamp
        while (left <= right) {
            const mid = Math.floor((left + right) / 2);
            if (values[mid].timestamp <= timestamp) {
                result = values[mid].value;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}